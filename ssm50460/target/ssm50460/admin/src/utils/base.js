const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm50460/",
            name: "ssm50460",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm50460/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人健康服务预约系统"
        } 
    }
}
export default base
