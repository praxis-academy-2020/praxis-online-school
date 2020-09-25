import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios"

Vue.use(Vuex)

let IP = '192.168.1.4:8080'

export default new Vuex.Store({
  state: {
    peserta: [],
    search: ''
  },
  getters: {
    gettersApiPeserta: function(state){
      return state.peserta
    }
  },
  mutations: {
    getApiPeserta: function(state){
      axios(`http://${IP}/praxis/murid/get`)
      .then(res => res.data)
      .then(res => {
        state.peserta = res
        console.log("get api", res)
      })
      .catch(err => console.log(err))
    }
  },
  actions: {
    getApiPeserta: function({commit}){
      commit('getApiPeserta')
    }
  },
  modules: {
  }
})
