//package trytry;
//
//import org.apache.commons.collections4.CollectionUtils;
//
//import java.util.ArrayList;
//import java.util.stream.Collectors;
//
//public class Test1 {
//
//    @Override
//    public IPage<CommunicationVo> getAllDynamic(Page<CshopCommunicationDynamicBean> pages, CommunicationDTO communicationDTO) {
//        IPage<CommunicationVo> page = new Page<>();
//        List<CommunicationVo> lists = new ArrayList<>();
//        //查询动态
//        IPage<CshopCommunicationDynamicBean> allDynamic = dynamicMapper.getAllDynamic(pages, communicationDTO.getUserId(), communicationDTO.getGroupCode());0
//        allDynamic.getRecords().stream().forEach((dynamicBean) -> {
//            CommunicationVo communicationVo = new CommunicationVo();
//            BeanUtils.copyProperties(dynamicBean, communicationVo);
//
//            //交流圈文件关联查询
//            QueryWrapper<CshopCommunicationDynamicFileBean> fileBeanQueryWrapper = new QueryWrapper<>();
//            fileBeanQueryWrapper.eq("dynamic_id", dynamicBean.getDynamicId()).orderByAsc("create_time");
//            List<CshopCommunicationDynamicFileBean> dynamicFileBeans = dynamicFileMapper.selectList(fileBeanQueryWrapper);
//            if (!CollectionUtils.isEmpty(dynamicFileBeans)) {
//                List<FileBaseVo> list = dynamicFileBeans.stream().map(fileBean -> {
//                    FileBaseVo fileVo = new FileBaseVo();
//                    BeanUtils.copyProperties(fileBean, fileVo);
//                    return fileVo;
//                }).collect(Collectors.groupingBy(FileBaseVo::CshopCommunicationDynamicFileBeanID));
//
//                //批量查询图片访问URL
//                BatchSignImageRequest request = new BatchSignImageRequest();
//                request.setFileBaseVos(list);
//                Result<List<FileOperationResultVo>> files = fileService.signImages(request);
//                communicationVo.setFiles(files.getData());
//            }
//
//            //交流圈评论关联查询
//            QueryWrapper<CshopCommunicationDiscussBean> discussBeanQueryWrapper = new QueryWrapper<>();
//            discussBeanQueryWrapper.eq("dynamic_id", dynamicBean.getDynamicId()).orderByAsc("create_time");
//            List<CshopCommunicationDiscussBean> discussBeans = discussMapper.selectList(discussBeanQueryWrapper);
//            communicationVo.setDiscussans(discussBeans);
//
//
//            //交流圈点赞关联查询
//            QueryWrapper<CshopCommunicationAdmireBean> admireBeanQueryWrapper = new QueryWrapper<>();
//            admireBeanQueryWrapper.eq("dynamic_id", dynamicBean.getDynamicId()).orderByAsc("create_time");
//            List<CshopCommunicationAdmireBean> admireBeans = admireMapper.selectList(admireBeanQueryWrapper);
//            communicationVo.setAdmires(admireBeans);
//            lists.add(communicationVo);
//        });
//        page.setRecords(lists);
//        page.setTotal(allDynamic.getTotal());
//        page.setCurrent(allDynamic.getCurrent());
//        page.setSize(allDynamic.getSize());
//        return page;
//    }
//}
