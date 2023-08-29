package ex9;

import java.util.Random;

public class Main {


        public static void main(String[] args) {
            Thread tarefa1 = new Thread(new Tarefa("tarefa_a"));
            Thread tarefa2 = new Thread(new Tarefa("tarefa_b"));
            Thread tarefa3 = new Thread(new Tarefa("tarefa_c"));
            Thread tarefaFim = new Thread(new TarefaFim());

            tarefa1.start();
            tarefa2.start();
            tarefa3.start();

            try {
                tarefa1.join();
                tarefa2.join();
                tarefa3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tarefaFim.start();
        }
    }

    class Tarefa implements Runnable {
        private String nome;

        public Tarefa(String nome) {
            this.nome = nome;
        }

        @Override
        public void run() {
            Random rand = new Random();
            int tempo = rand.nextInt(5000) + 1000; // Tempo aleatório entre 1 e 5 segundos

            try {
                Thread.sleep(tempo);
                System.out.println(nome + " concluída após " + (tempo / 1000) + " segundos");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class TarefaFim implements Runnable {
        @Override
        public void run() {
            System.out.println("tarefa_fim executando após todas as outras tarefas concluídas");
        }
    }


