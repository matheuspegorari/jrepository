package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventosCobranca extends AbstractSankhyaEntity<EventosCobranca> {
   private BigDecimal codEvento;
   private BigDecimal codRegua;
   private char[] config;
   private String descricao;
   private Timestamp dhAlter;
   private BigDecimal diaExec;
   private BigDecimal execApos;
   private char[] filtro;
   private BigDecimal tipo;

   public BigDecimal getCodEvento() {
        return codEvento;
   }

   public void setCodEvento(BigDecimal codEvento) {
        markAsChanged("CODEVENTO", codEvento);
        this.codEvento = codEvento;
   }

   public BigDecimal getCodRegua() {
        return codRegua;
   }

   public void setCodRegua(BigDecimal codRegua) {
        markAsChanged("CODREGUA", codRegua);
        this.codRegua = codRegua;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getDiaExec() {
        return diaExec;
   }

   public void setDiaExec(BigDecimal diaExec) {
        markAsChanged("DIAEXEC", diaExec);
        this.diaExec = diaExec;
   }

   public BigDecimal getExecApos() {
        return execApos;
   }

   public void setExecApos(BigDecimal execApos) {
        markAsChanged("EXECAPOS", execApos);
        this.execApos = execApos;
   }

   public char[] getFiltro() {
        return filtro;
   }

   public void setFiltro(char[] filtro) {
        markAsChanged("FILTRO", filtro);
        this.filtro = filtro;
   }

   public BigDecimal getTipo() {
        return tipo;
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.codEvento = vo.asBigDecimal("CODEVENTO");
        this.codRegua = vo.asBigDecimal("CODREGUA");
        this.config = vo.asClob("CONFIG");
        this.descricao = vo.asString("DESCRICAO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.diaExec = vo.asBigDecimal("DIAEXEC");
        this.execApos = vo.asBigDecimal("EXECAPOS");
        this.filtro = vo.asClob("FILTRO");
        this.tipo = vo.asBigDecimal("TIPO");
        return this;
   }
}
