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
                <div>
                  <div v-if="isLoading">
                    <v-progress-circular :width="3" indeterminate color="primary"></v-progress-circular>
                  </div>
                  <div v-else>
                    <v-btn color="primary" @click="login">Login</v-btn>
                  </div>
                </div>
              </v-card-actions>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
import * as api from '../api/praxis'

export default {
  data: () => {
    return {
      isLoading: false,
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
        this.isLoading = true;
        api.login(this.form)
        // axios
        //   .post("http://192.168.43.56:8080/api/auth/signin", this.form)
          .then(res => {
            console.log(res);
            localStorage.setItem(res.data.tokenType, res.data.accessToken);
            this.$store.state.token = res.data.accessToken;
            this.$swal("juoossss");
            this.$router.push({ name: "Dashboard" });
          })
          .catch(err => {
            this.isLoading = false;
            this.$swal({
              icon: "error",
              title: err
            });
          });
      } else {
        this.$swal({
          icon: "error",
          title: "Tet tottt!"
        });
      }
    }
  },
  beforeCreate() {
    if (!localStorage.getItem("Bearer")) {
      scrollTo(0, 0);
    } else {
      this.$router.push({ name: "Dashboard" });
    }
  }
};
</script>