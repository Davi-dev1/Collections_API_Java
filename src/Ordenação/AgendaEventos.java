package Ordenação;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate,Evento> eventosMap;


    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }



    public void adicionarEveto(LocalDate data,String nome,String atracao){
        Evento evento = new Evento(nome,atracao);
        eventosMap.put(data,evento);

    }
    public void exibirAgenda(){
   Map<LocalDate,Evento>eventosTreeMap = new TreeMap<>(eventosMap); //o localdate sabe organizar de forma crescente
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        //Set<LocalDate> dataSet = eventosMap.keySet();
       //Collection<Evento> values= eventosMap.values();

       //As duas coleções acima são totalmente  totalamente diferentes pois só retonam valores unicos , a set só retorna a set e a values retorna apenas o valor

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento>eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate,Evento> entry:eventosTreeMap.entrySet()){
           if (entry.getKey().isEqual(dataAtual)||entry.getKey().isAfter(dataAtual)){
              proximaData= entry.getKey();
              proximoEvento = entry.getValue();
               System.out.println("O próximo evento : " +proximoEvento + "acontecerá na data " + proximaData);
           break;

           }
        }


    }



    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEveto(LocalDate.of(2022, Month.JULY,15),"Evento 1 ","Atração 1 ");
        agendaEventos.adicionarEveto(LocalDate.of(2022, Month.AUGUST,9),"Evento 2 ","Atração 2 ");
        agendaEventos.adicionarEveto(LocalDate.of(2000, 8,2),"Evento 3 ","Atração 3 ");
        agendaEventos.adicionarEveto(LocalDate.of(2025, Month.AUGUST,13),"Evento 4 ","Atração 4 ");
        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
