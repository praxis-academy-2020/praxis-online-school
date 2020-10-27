<template>
  <div>
      <h1>Program {{this.$route.params.name}}</h1>
      <foot/>
  </div>
</template>

<script>
import foot from "@/components/footer/footer-home.vue"

export default {
    components: {
        foot
    }
}
</script>

<style>

</style>