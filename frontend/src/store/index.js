import Vue from 'vue'
import Vuex from 'vuex'
import * as api from '../api/praxis'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    karya: []
  },
  getters: {
    gettersKarya: function (state) {
      return state.karya
    }
  },
  mutations: {
    getApiKarya: async function(state){
      let res = await api.getKarya()
      let data = await res.data;
      state.karya = data;
      console.log(data)
    }
  },
  actions: {
    getApiKarya: function({commit}){
      commit('getApiKarya')
    },
    postPeserta: function(params){
      api.postPeserta(params);
    }
  }
})
