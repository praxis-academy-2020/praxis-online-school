<template>
  <v-app id="inspire">
    <v-main>
      <v-container class="fill-height" fluid>
        <v-row align="center" justify="center">
          <v-col cols="12" sm="8" md="4">
            <v-card class="elevation-12">
              <v-toolbar color="primary" dark flat>
                <v-toolbar-title>Login</v-toolbar-title>
                <v-spacer></v-spacer>
              </v-toolbar>

              <v-card-text>
                <v-form ref="form">
                  <v-text-field
                    label="Username"
                    name="username"
                    v-model="form.usernameOrEmail"
                    prepend-icon="mdi-account"
                    type="text"
                    :rules="nameVal"
                  ></v-text-field>

                  <v-text-field
                    id="password"
                    label="Password"
                    v-model="form.password"
                    name="password"
                    prepend-icon="mdi-lock"
                    type="password"
                    :rules="passwordVal"
                  ></v-text-field>
                </v-form>
              </v-card-text>
              <v-card-actions>
                <v-spacer></v-spacer>
                <v-btn color="primary" @click="login">Login</v-btn>
              </v-card-actions>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
import axios from "axios";

export default {
  data: () => {
    return {
      form: {
        usernameOrEmail: "",
        password: ""
      },
      nameVal: [v => !!v || "required"],
      passwordVal: [v => !!v || "required"]
    };
  },
  methods: {
    login: function() {
      if (this.$refs.form.validate()) {
        axios
          .post("http://192.168.1.35:8081/api/auth/signin", this.form)
          .then(res => {
            console.log(res);
            this.$swal("juoossss");
            this.$router.push({ name: "Admin/dashboard" });
          })
          .catch(err => {
            console.log(err)
            alert('err')
          })
      } else {
        this.$swal("tetotttt");
      }
    }
  }
};
</script>