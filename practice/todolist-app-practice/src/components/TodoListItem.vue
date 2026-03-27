<template>
  <li
    class="list-group-item"
    :class="{ 'list-group-item-success': todoitem.completed }"
  >
    <input
      type="checkbox"
      class="pointer me-3"
      :checked="todoitem.completed"
      @click="checkCompleted"
    />
    <span class="pointer" :class="todoitem.completed ? 'todo-done' : ''">
      {{ todoitem.todo }} {{ todoitem.completed ? '(완료)' : '' }}
    </span>
    <span class="float-end badge bg-secondary pointer" @click="deleteTodo"
      >삭제</span
    >
  </li>
</template>
<script setup>
const props = defineProps({
  todoitem: {
    type: Object,
    required: true,
  },
});

const emits = defineEmits(['check-completed', 'delete-todo']);

const checkCompleted = () => {
  emits('check-completed', props.todoitem.id);
};
const deleteTodo = () => {
  emits('delete-todo', props.todoitem.id);
};
</script>
