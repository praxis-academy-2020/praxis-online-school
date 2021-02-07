<template>
  <div>
    <nava />
    <div>
      <hero
        title="Fullstack developer"
        disk="Program belajar untuk menjadi seorang Fullstack developer, meningkatkan skill pemrogramman Fullstack, dan GRATIS."
      />
      <pengertian
        :src="gmb"
        judul="Fullstack"
        keterangan=" seorang ahli teknologi yang harus mampu memperbaiki front-end maupun back-end dari sebuah aplikasi."
      />
      <silabus
        title1="Pembelajaran"
        lorem1="Pada minggu pertama ini kita akan belajar tentang dasar-dasar tentang menggunakan java dan ekosistem peranti pengembangan, pada minggu ke dua kita mulai masuk ke dalam pelajaran unit testing hingga endpoint database, pada minggu ke tiga kita kan mulai belajar  javascript, pada minggu ke empat kita akan fokus belajar menggunakan vuejs."
        title2="Proyek Internal"
        lorem2="Pada bulan ke dua ini kita mendapatkan sebuah project kecil lingkup Fullstack, kita akan diberikan kesempatan untuk mengeluarkan ide untuk membuat website sesuai tema yang diberikan."
        title3="Proyek Bersama"
        lorem3="Pada bulan ketiga ini kita akan melakukan proyek yang lebih besar dengan berkolaborasi dengan divisi team lain bisa dengan team lain."
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
  mounted() {
    scrollTo(0, 0);
  },
};
</script>