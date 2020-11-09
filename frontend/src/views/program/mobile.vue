<template>
  <div>
    <nava />
    <div>
      <hero
        title="Mobile developer"
        disk="Program belajar untuk menjadi seorang Mobile developer, meningkatkan skill pemrogramman Mobile, dan GRATIS."
      />
      <pengertian
        :src="gmb"
        judul="Mobile"
        keterangan=" Pengembangan aplikasi seluler adalah tindakan atau proses pengembangan aplikasi seluler untuk perangkat seluler, seperti asisten digital pribadi, asisten digital perusahaan atau ponsel."
      />
      <silabus
      title1="Pembelajaran"
      lorem1="Pada minggu pertama ini kita akan belajar bahasa pemrograman Dart, pada minggu ke dua kita mulai masuk ke dalam pelajaran React, pada minggu ke tiga kita kan mulai belajar state management hingga internasional aplikasi, pada minggu ke empat kita akan fokus mendyploy aplikasi."
      title2="Proyek Internal"
      lorem2="Pada bulan ke dua ini kita mendapatkan sebuah project kecil lingkup Mobile, kita akan diberikan kesempatan untuk mengeluarkan ide untuk membuat Aplikasi sesuai tema yang diberikan."
      title3="Proyek Bersama"
      lorem3="Pada bulan ketiga ini kita akan melakukan proyek yang lebih besar dengan mengkaloborasi dengan divisi team lain."
       />
      <ajakan />
    </div>
    <foot />
  </div>
</template>

<script>
import nava from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import hero from "@/components/program/hero.vue";
import pengertian from "@/components/program/pengertian.vue";
import gmb from "@/assets/program/ill1.svg";
import silabus from "@/components/program/silabus.vue";
import ajakan from "@/components/program/ajakan.vue";

export default {
  data() {
    return {
      gmb,
    };
  },
  components: {
    nava,
    foot,
    hero,
    pengertian,
    silabus,
    ajakan,
  },
  mounted(){
    scrollTo(0, 0);
  }
};
</script>