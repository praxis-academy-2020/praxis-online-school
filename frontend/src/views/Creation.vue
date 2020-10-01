<template>
  <div>
    <navbarHome />
    <div class="mt-15">
      <v-row>
        <v-col cols="12" sm="6" v-for="(item, index) in gettersKarya" :key="index">
          <router-link :to="`/creation/${item.id}`">
          <h1>{{item.title}}</h1>
          <p>deskripsi : {{item.deskripsi}}</p>
          <p>github : {{item.github}}</p>
          <p>anggota : <span v-for="(i, index) in item.anggota" :key="index">
            {{i}}  
          </span></p>
          </router-link>
        </v-col>
      </v-row>
    </div>
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import { mapGetters } from "vuex";

export default {
  components: {
    navbarHome,
    foot
  },
  computed: {
    ...mapGetters(["gettersKarya"])
  }
};
</script>

<style>
</style>