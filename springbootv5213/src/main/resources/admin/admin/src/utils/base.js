const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootv5213/",
            name: "springbootv5213",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootv5213/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "桥牌计分系统"
        } 
    }
}
export default base
