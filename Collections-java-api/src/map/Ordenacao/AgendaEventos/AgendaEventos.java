package map.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos(){

        this.eventosMap = new HashMap<>();

    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){

        eventosMap.put(data, new Evento(nome, atracao));

    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();

        LocalDate proximaData = null;

        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){

            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){

                proximaData = entry.getKey();

                proximoEvento = entry.getValue();

                System.out.println("O proximo evento acontecera: " + proximoEvento + " acontecera na data: " + proximaData);

                break;

            }

        }

    }

    public void exibirAgenda(){

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

        System.out.println(eventosTreeMap);

    }

    public static void main(String[] args) {
        
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento1", "Atração1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento2", "Atração2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento3", "Atração3");

        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.NOVEMBER, 24), "Evento4", "Atração4");

        agendaEventos.obterProximoEvento();

    }

}
