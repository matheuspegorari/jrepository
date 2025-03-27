package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventosCobranca extends AbstractSankhyaEntity<EventosCobranca> {
   public BigDecimal getCodEvento() {
        return this.getVo().asBigDecimal("CODEVENTO");
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
   }

   public BigDecimal getCodRegua() {
        return this.getVo().asBigDecimal("CODREGUA");
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getDiaExec() {
        return this.getVo().asBigDecimal("DIAEXEC");
   }

   public void setDiaExec(BigDecimal diaExec) {
        markAsChanged("DIAEXEC", diaExec);
   }

   public BigDecimal getExecApos() {
        return this.getVo().asBigDecimal("EXECAPOS");
   }

   public void setExecApos(BigDecimal execApos) {
        markAsChanged("EXECAPOS", execApos);
   }

   public char[] getFiltro() {
        return this.getVo().asClob("FILTRO");
   }

   public void setFiltro(char[] filtro) {
        markAsChanged("FILTRO", filtro);
   }

   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TGFECB";
   }

   @Override
   public String getEntityName() {
        return "EventosCobranca";
   }

   @Override
   public EventosCobranca fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
