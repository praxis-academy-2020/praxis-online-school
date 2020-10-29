<template>
  <div>
    <nava />
    <div>
      <hero 
        title="Frontend developer"
      />
      <silabus />
      <ajakan />
    </div>
    <foot />
  </div>
</template>

<script>
import nava from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import hero from "@/components/program/hero.vue";
import silabus from "@/components/program/silabus.vue";
import ajakan from "@/components/program/ajakan.vue"

export default {
  components: {
    nava,
    foot,
    hero,
    silabus,
    ajakan
  },
};
</script>