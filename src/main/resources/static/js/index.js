var menu = new Array();
menu.push("/home");
menu.push("/chart");
var indexVue = new Vue({
    el:'#wrapper',
    data:{
        menu:menu,
    },
    methods:{
        test:function () {
            alert(6666666666);
        }
    }
})