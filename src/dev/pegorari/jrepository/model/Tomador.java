package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Tomador implements SankhyaEntity<Tomador> {

   private BigDecimal codEmp;
   private BigDecimal codFunc;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private Timestamp dtFim;
   private Timestamp dtInicio;
   private String observacao;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodFunc() {
        return codFunc;
   }

   public void setCodFunc(BigDecimal codFunc) {
        this.codFunc = codFunc;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public Timestamp getDtFim() {
        return dtFim;
   }

   public void setDtFim(Timestamp dtFim) {
        this.dtFim = dtFim;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        this.dtInicio = dtInicio;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   @Override
   public String getEntityName() {
        return "Tomador";
   }

   @Override
   public Tomador fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codFunc = vo.asBigDecimal("CODFUNC");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dtFim = vo.asTimestamp("DTFIM");
        this.dtInicio = vo.asTimestamp("DTINICIO");
        this.observacao = vo.asString("OBSERVACAO");
        return this;
   }
}
