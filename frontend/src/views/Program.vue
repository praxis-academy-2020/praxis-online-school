<template>
  <div>
    <navbar />
    <div class="mt-15">
        <Hero />
        <Pengertian />
        <Silabus />
        <Ajakan />
      <h1>Program {{ this.$route.params.name }}</h1>
        
    </div>
    <foot />
  </div>
</template>

<script>
import navbar from "@/components/navbar/navbar-home.vue";
import Hero from "@/components/program/hero.vue"
import foot from "@/components/footer/footer-home.vue";
import Pengertian from"@/components/program/pengertian.vue";
import Silabus from "@/components/program/silabus.vue";
import Ajakan from "@/components/program/ajakan.vue";

export default {
  components: {
    foot,
    navbar,
    Hero,
    Pengertian,
    Silabus,
    Ajakan,
  },
};
</script>

<style>
</style>