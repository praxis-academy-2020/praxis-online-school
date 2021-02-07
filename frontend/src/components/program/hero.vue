<template>
  <div style="padding: 130px 0 100px 0">
    <v-container>
      <v-row>
        <v-col cols="12" md="6" class="align-self-center">
          <div class="mb-10 text-h4 text-sm-h3 font-weight-medium">
            {{title}}
          </div>
          <div class="py-5">
           {{disk}}
          </div>

          <div class="pt-10">
            <v-btn
              to="/register/syarat"
              large
              color="#63D0FF"
              class="white--text text-capitalize"
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