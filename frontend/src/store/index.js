import Vue from 'vue'
import Vuex from 'vuex'
import axios from "axios"

Vue.use(Vuex)

let IP = '192.168.1.33:8080'

export default new Vuex.Store({
  state: {
    cv: [],
    peserta: [],
    karya: [
      {
        id: 1,
        title: "JOB DEV",
        deskripsi: "diskripsi",
        github: 'github',
        anggota: ['1', '2', '3'],
        src: "https://www.youtube.com/embed/FaAtjbyqGns"
      },
      {
        id: 2,
        title: "title",
        deskripsi: "diskripsi",
        github: 'github',
        anggota: ['1', '2', '3'],
        src: "https://www.youtube.com/embed/IQw-4JABPCM"
      },
      {
        id: 3,
        title: "title",
        deskripsi: "diskripsi",
        github: 'github',
        anggota: ['1', '2', '3'],
        src: "https://www.youtube.com/embed/IQw-4JABPCM"
      }
    ]
  },
  getters: {
    gettersApiPeserta: function (state) {
      return state.peserta
    },
    gettersKarya: function (state) {
      return state.karya
    },
    gettersCV: function (state) {
      return state.cv
    }
  },
  mutations: {
    getApiPeserta: function (state) {
      const access = localStorage.getItem('Bearer')
      console.log('ini token yg dimasukin', access)
      axios.get(`http://${IP}/praxis/murid/get`, {
        headers: {
          "Authorization": "Bearer: " + access
        }
      })
        .then(res => res.data)
        .then(data => {
          state.peserta = data;

          // gabungin cv dan data peserta
          for (let i = 0; i < state.peserta.length; i++) {
            state.peserta[i].cv = state.cv[i];
          }

          console.log("CV", state.cv)
          console.log("get api", state.peserta)
        })
        .catch(err => console.log(err))
    }
  },
  actions: {
    getApiPeserta: function ({ commit }) {
      commit('getApiPeserta')
    }
  },
  modules: {
  }
})
