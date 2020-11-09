<template>
  <div>
    <nava />
    <div>
      <hero
        title="Nodejs "
        disk="Program belajar untuk menjadi seorang Nodejs , meningkatkan skill pemrogramman Nodejs, dan GRATIS."
      />
      <pengertian
        :src="gmb"
        judul="Nodejs"
        keterangan=" Node.js adalah platform  buatan Ryan Dahl untuk menjalankan aplikasi web berbasis JavaScript yang dikenalkan pada tahun 2009. Dengan platform ini, Anda dapat menjalankan JavaScript dari sisi server."
      />
      <silabus
      title1="Pembelajaran"
      lorem1="Pada minggu pertama ini kita akan belajar tentang dasar-dasar tentang menggunakan javascript, pada minggu ke dua kita mulai masuk ke dalam Web Framework Express, pada minggu ke tiga kita kan mulai belajar akses basis data, pada minggu ke empat kita akan fokus Node js lanjutan sebagai backend."
      title2="Proyek Internal"
      lorem2="Pada bulan ke dua ini kita mendapatkan sebuah project kecil lingkup backend nodejs, kita akan diberikan kesempatan untuk mengeluarkan ide untuk membuat aplikasi sesuai tema yang diberikan."
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