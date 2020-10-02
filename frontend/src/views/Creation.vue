<template>
  <div>
    <navbarHome />
    <div class="mt-15">
      <v-row>
        <v-col cols="12" sm="6" v-for="(item, index) in gettersKarya" :key="index">
          <cardd
            :title="item.title"
            :src="gambar"
            :route="item.id"
          />
        </v-col>
      </v-row>
    </div>
    <foot />
  </div>
</template>

<script>
import navbarHome from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import cardd from "@/components/karya/card.vue";
import gambar from "@/assets/p.png";
import { mapGetters } from "vuex";

export default {
  data: () => {
    return {
      gambar
    }
  },
  components: {
    navbarHome,
    foot,
    cardd
  },
  computed: {
    ...mapGetters(["gettersKarya"])
  },
  mounted(){
    scrollTo(0, 0)
  }
};
</script>

<style>
</style>