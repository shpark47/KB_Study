<template>
  <div>
    x : <input type="text" v-model.number="x" /> <br />
    결과 : {{ result }}
  </div>
</template>
<script>
import { ref, watch } from 'vue';
export default {
  name: 'Calc5',
  setup() {
    const x = ref(0); // 0으로 초기화
    const result = ref(0); // 0으로 초기화
    // 필요한 경우 코드 추가

    watch(x, (curr, old) => {
      result.value = curr;
      console.log('이전 값 : ' + old);
      console.log('새로운 값 : ' + curr);
    });
    return { x, result };
  },
};
</script>
