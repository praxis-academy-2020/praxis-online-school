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
    path: '*',
    name: '404',
    component: () => import('../views/404.vue')
  },
  {
    path: "/program/frontend-developer",
    name: "Frontend",
    component: () => import('../views/program/frontend.vue')
  },
  {
    path: "/program/fullstack-developer",
    name: "Fullstack",
    component: () => import('../views/program/fullstack.vue')
  },
  {
    path: "/program/python-developer",
    name: "Python",
    component: () => import('../views/program/python.vue')
  },
  {
    path: "/program/nodejs-programming",
    name: "Nodejs",
    component: () => import('../views/program/nodejs.vue')
  },
  {
    path: "/program/mobile-developer",
    name: "Mobile",
    component: () => import('../views/program/mobile.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
