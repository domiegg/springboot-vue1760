import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import guanzhong from '@/views/modules/guanzhong/list'
    import bisaileixing from '@/views/modules/bisaileixing/list'
    import paimingjifen from '@/views/modules/paimingjifen/list'
    import caipan from '@/views/modules/caipan/list'
    import bisaisaizhi from '@/views/modules/bisaisaizhi/list'
    import config from '@/views/modules/config/list'
    import bisaixuanshou from '@/views/modules/bisaixuanshou/list'
    import saishixinxi from '@/views/modules/saishixinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告信息',
        component: news
      }
      ,{
	path: '/guanzhong',
        name: '观众',
        component: guanzhong
      }
      ,{
	path: '/bisaileixing',
        name: '比赛类型',
        component: bisaileixing
      }
      ,{
	path: '/paimingjifen',
        name: '排名计分',
        component: paimingjifen
      }
      ,{
	path: '/caipan',
        name: '裁判',
        component: caipan
      }
      ,{
	path: '/bisaisaizhi',
        name: '比赛赛制',
        component: bisaisaizhi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/bisaixuanshou',
        name: '比赛选手',
        component: bisaixuanshou
      }
      ,{
	path: '/saishixinxi',
        name: '赛事信息',
        component: saishixinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
