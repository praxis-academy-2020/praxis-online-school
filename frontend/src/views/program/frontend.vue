<template>
  <div>
    <nava />
    <div>
      <hero
        title="Frontend developer"
        disk="Program belajar untuk menjadi seorang Frontend developer, meningkatkan skill pemrogramman Frontend, dan GRATIS."
      />
      <pengertian
        :src="gmb"
        judul="Frontend"
        keterangan=" praktik mengubah data ke antarmuka grafis, melalui penggunaan HTML, CSS, dan JavaScript, sehingga pengguna dapat melihat dan berinteraksi dengan data itu."
      />
      <silabus
      title1="Pembelajaran"
      lorem1="Pada minggu pertama ini kita akan belajar tentang dasar-dasar tentang menggunakan javascript, pada minggu ke dua kita mulai masuk ke dalam pelajaran javascript OOP, pada minggu ke tiga kita kan mulai menggunakan javascript DOM dan mulai masuk ke dalam vuejs, pada minggu ke empat kita akan fokus belajar menggunakan vuejs dan framework vuetify."
      title2="Proyek Internal"
      lorem2="Pada bulan ke dua ini kita mendapatkan sebuah project kecil lingkup frontend, kita akan diberikan kesempatan untuk mengeluarkan ide untuk membuat tampilan website sesuai tema yang diberikan."
      title3="Proyek Bersama"
      lorem3="Pada bulan ketiga ini kita akan melakukan proyek yang lebih besar dengan berkolaborasi dengan divisi team lain bisa dengan team backend, python ataupun mobile."
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
import gmb from "@/assets/program/ill2.svg";
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