<template>
  <div>
      <h1>Formulir</h1>
      <formRegister/>
      <router-link to="/register/syarat">back</router-link>
  </div>
</template>

<script>
import formRegister from "@/components/form-register.vue"


export default {
    components: {
        formRegister
    }
}
</script>

<style>

</style>