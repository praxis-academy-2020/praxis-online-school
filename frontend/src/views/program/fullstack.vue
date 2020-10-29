<template>
  <div>
    <nava />
    <div>
      <hero 
        title="Fullstack developer"
      />
    </div>
    <foot />
  </div>
</template>

<script>
import nava from "@/components/navbar/navbar-home.vue";
import foot from "@/components/footer/footer-home.vue";
import hero from "@/components/program/hero.vue";

export default {
  components: {
    nava,
    foot,
    hero,
  },
};
</script>