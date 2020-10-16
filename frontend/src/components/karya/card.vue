<template>
  <v-container>
    <div class="mt-5 mb-5 text-center">
      <h1>KARYA KITA</h1>
    </div>
    <div>
      <kartu></kartu>
    </div>
  </v-container>
</template>

<script>
// import g1 from "@/assets/foto karya/jobdev.png";
// import g2 from "@/assets/foto karya/angkringan.jpg";
// import g3 from "@/assets/p.png";
// import g4 from "@/assets/foto karya/perpustakaan.jpg";
// import g5 from "@/assets/foto karya/bs.jpg";
// import g6 from "@/assets/foto karya/catat.png";
import kartu from "@/components/karya/card22.vue";

export default {
  data() {
    return {
      // g1,
      // g2,
      // g3,
      // g4,
      // g5,
      // g6
    };
  },
  components: {
    kartu
  },
  mounted() {
    console.log(this.gettersKarya);
  }
};
</script>