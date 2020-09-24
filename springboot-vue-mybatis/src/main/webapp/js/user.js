new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            email:"",
            age:"",
            sex:""
        },
        userList:[]

    },
    methods:{
        findAll:function(){
            //在当前方法中定义一个变量，表明是vue对象
            var _this = this;
            axios.get('user/findAll')
                .then(function (response) {
                    _this.userList = response.data;//响应数据给userList赋值
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                })
        },
        //点击编辑
        findById:function (userid) {
            //在当前方法中定义一个变量，表明是vue对象
            var _this = this;
            axios.get('user/findById',{params:{id:userid}})
                .then(function (response) {
                    _this.user = response.data;//响应数据给userList赋值
                    $("#myModal").modal("show");
                })
                .catch(function (error) {
                    console.log(error);
                })
        },

        //点击详情
        findDetailById:function (userid) {
            //在当前方法中定义一个变量，表明是vue对象
            var _this = this;
            axios.get('user/findById',{params:{id:userid}})
                .then(function (response) {
                    _this.user = response.data;//响应数据给userList赋值
                    $("#myDetailModal").modal("show");
                })
                .catch(function (error) {
                    console.log(error);
                })
        },

        //修改用户信息
        update:function (user) {//post请求
            //在当前方法中定义一个变量，表明是vue对象
            var _this = this;
            axios.post('user/updateUser', _this.user)
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        //点击新建

        addUser:function () {

            $("#addUserModal").modal("show");
        },

        //新增用户信息

        insert:function (user) {//post请求
            //在当前方法中定义一个变量，表明是vue对象
            var _this = this;
            axios.post('user/insertUser', _this.user)
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                });
        },

        //删除用户信息
        deleteUserById:function (userid) {

            //在当前方法中定义一个变量，表明是vue对象

            var _this = this;
            axios.get('user/deleteUsersById',{params:{id:userid}})
                .then(function (response) {
                    _this.findAll();
                })
                .catch(function (error) {
                    console.log(error);
                })
        }


    },
    created:function() {//当我们页面加载的时候触发请求，查询所有
        this.findAll();
    }
});