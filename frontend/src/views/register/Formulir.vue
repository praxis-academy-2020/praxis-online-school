<template>
  <div class="mt-15">
      <formRegister/>
  </div>
</template>

<script>
import formRegister from "@/components/form-register.vue"


export default {
    components: {
        formRegister
    },
    mounted(){
        scrollTo(0, 0)
    }
}
</script>

<style>

</style>