import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios"

Vue.use(Vuex)

let IP = '192.168.1.4:8080'

export default new Vuex.Store({
  state: {
    peserta: []
  },
  getters: {
    // getPeserta: function(state){
    //   return state.peserta
    // },
    gettersApiPeserta: function(state){
      return state.peserta
    }
  },
  mutations: {
    // addPeserta: function(state, payload){
    //   return state.peserta.push(payload)
    // },
    getApiPeserta: function(){
      axios(`http://${IP}/praxis/murid/get`)
      .then(res => res.data)
      .then(res => console.log(res))
      .catch(err => console.log(err))
    },
    // postApiPeserta: function(state){
    //   axios.post(`http://${IP}/praxis/murid/post`, state.peserta)
    //   .then(res => console.log(res))
    //   .catch(err => console.log(err))
    // }
  },
  actions: {
    // addPeserta: function({commit}, payload){
    //   commit('addPeserta', payload)
    // },
    getApiPeserta: function({commit}){
      commit('getApiPeserta')
    },
    // postApiPeserta: function({commit}){
    //   commit('postApiPeserta')
    // }
  },
  modules: {
  }
})
