import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/register',
    name: 'Register',
    component: () => import('../views/register/Register.vue'),
    children: [
      {
        path: 'syarat',
        name: 'Syarat',
        component: () => import('../views/register/Syarat.vue')
      },
      {
        path: 'formulir',
        name: 'Formulir',
        component: () => import('../views/register/Formulir.vue')
      }
    ]
  },
  {
    path: '/creation',
    name: 'Creation',
    component: () => import('../views/Creation.vue')
  },
  {
    path: '/activity',
    name: 'Activity',
    component: () => import('../views/Activity.vue')
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Login.vue')
  },
  {
    path: '*',
    name: '404',
    component: () => import('../views/404.vue')
  },
  {
    path: '/admin',
    name: 'Admin',
    component: () => import('../views/admin/Admin.vue'),
    children: [
      {
        path: 'dashboard',
        name: 'Dashboard',
        component: () => import('../views/admin/Dashboard.vue')
      },
      {
        path: 'tambah-karya',
        name: 'Tambah-karya',
        component: () => import('../views/admin/Tambah-karya.vue')
      },
      {
        path: 'tampil-table',
        name: 'Tampil-table',
        component: () => import('../views/admin/Tampil-table.vue')
      }
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

// router.beforeEach((to,from, next) => {
//   if (['Home', 'Login', '404', 'Activity', 'Detail', 'Creation', 'Formulir', 'Syarat', 'Register'].includes(name => to.name === name) && localStorage.getItem('Bearer')) {
//     return next({ name: 'Dashboard' })
//   }
//   else if (['Admin', 'Dashboard', 'Tambah-karya', 'Tampil-table'].includes(name => to.name === name) && localStorage.getItem('Bearer') === null) {
//     return next({ name: '404' })
//   }
//   next()
// })

export default router
