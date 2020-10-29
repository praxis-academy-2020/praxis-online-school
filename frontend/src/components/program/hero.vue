<template>
  <div style="padding: 100px 0 0 0">
    <v-container>
      <v-row>
        <v-col cols="12" md="6">
          <div class="text-h3 py-5">{{title}}</div>
          <div class="py-5">
           {{disk}}
          </div>

          <div class="pt-10">
            <v-btn
              to="/register/syarat"
              large
              color="#63D0FF"
              class="white--text"
            >
              daftar sekarang
            </v-btn>
          </div>
        </v-col>

        <v-col cols="0" md="6" class="d-none d-md-flex justify-center">
          <img src="@/assets/program/ill1.svg" alt="image" width="350px" />
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  props: ['title','disk']
};
</script>