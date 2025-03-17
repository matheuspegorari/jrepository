package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventoPeriodico extends AbstractSankhyaEntity<EventoPeriodico> {
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private String descricao;
   private Timestamp dtAlter;
   private String evento;
   private String geraEvento;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getEvento() {
        return evento;
   }

   public void setEvento(String evento) {
        this.evento = evento;
   }

   public String getGeraEvento() {
        return geraEvento;
   }

   public void setGeraEvento(String geraEvento) {
        this.geraEvento = geraEvento;
   }

   @Override
   public String getTableName() {
        return "TGFEPS";
   }

   @Override
   public String getEntityName() {
        return "EventoPeriodico";
   }

   @Override
   public EventoPeriodico fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descricao = vo.asString("DESCRICAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.evento = vo.asString("EVENTO");
        this.geraEvento = vo.asString("GERAREVENTO");
        return this;
   }
}
