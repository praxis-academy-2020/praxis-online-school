<template>
  <div>
    <nava />
    <div>
      <hero
        title="Python developer"
        disk="Program belajar untuk menjadi seorang Python developer, meningkatkan skill pemrogramman Python, dan GRATIS."
      />
      <pengertian
        :src="gmb"
        judul="Python"
        keterangan=" Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan."
      />
      <silabus
      title1="Pembelajaran"
      lorem1="Pada minggu pertama ini kita akan belajar tentang dasar-dasar tentang menggunakan Python, pada minggu ke dua kita mulai masuk ke dalam pelajaranmenggunakan NumPy, pada minggu ke tiga kita kan mulai menggunakan Machine Learning, pada minggu ke empat kita akan fokus belajar  Deep Learning."
      title2="Proyek Internal"
      lorem2="Pada bulan ke dua ini kita mendapatkan sebuah project kecil lingkup Python, kita akan diberikan kesempatan untuk mengeluarkan ide untuk membuat tampilan website sesuai tema yang diberikan."
      title3="Proyek Bersama"
      lorem3="Pada bulan ketiga ini kita akan melakukan proyek yang lebih besar dengan berkolaborasi dengan divisi team lain."
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