const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootmf383/",
            name: "springbootmf383",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootmf383/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "公交线路查询系统"
        } 
    }
}
export default base
