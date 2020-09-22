<template>
  <div>
    <form @submit="checkForm" novalidate="true">
      <div v-if="errors.length">
        <h1>is required:</h1>
        <div v-for="(item, index) in errors" :key="index">
          <h1>{{item}}</h1>
        </div>
      </div>

      <v-text-field v-model="name" label="Name" required></v-text-field>

      <v-text-field v-model="email" label="E-mail"></v-text-field>

      <v-btn class="mr-4" type="submit">submit</v-btn>
    </form>
  </div>
</template>

<script>
export default {
  data: () => {
    return {
      errors: [],
      name: null,
      email: null
    };
  },
  methods: {
    checkForm: function(e) {
      this.errors = [];
      if (!this.name) this.errors.push("Name required.");

      if (!this.email) {
        this.errors.push("Email required.");
      } else if (!this.validEmail(this.email)) {
        this.errors.push("Valid email required.");
      }
      if (!this.errors.length) return true;
      e.preventDefault();
    },
    validEmail: function(email) {
      var re = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
      return re.test(email);
    }
  }
};
</script>