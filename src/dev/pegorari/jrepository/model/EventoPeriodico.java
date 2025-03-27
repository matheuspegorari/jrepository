package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventoPeriodico extends AbstractSankhyaEntity<EventoPeriodico> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public String getEvento() {
        return this.getVo().asString("EVENTO");
   }

   public void setEvento(String evento) {
        markAsChanged("EVENTO", evento);
   }

   public String getGeraEvento() {
        return this.getVo().asString("GERAREVENTO");
   }

   public void setGeraEvento(String geraEvento) {
        markAsChanged("GERAREVENTO", geraEvento);
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
        this.setVo(vo);
        return this;
   }
}
