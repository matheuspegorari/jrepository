package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AcompanhamentoNota implements SankhyaEntity<AcompanhamentoNota> {

   private BigDecimal codUsu;
   private Timestamp dhOcor;
   private String digitado;
   private BigDecimal hrAct;
   private BigDecimal notaPontual;
   private BigDecimal notaQualidade;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private String ocorrencias;
   private String referencia;
   private BigDecimal sequencia;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhOcor() {
        return dhOcor;
   }

   public void setDhOcor(Timestamp dhOcor) {
        this.dhOcor = dhOcor;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public BigDecimal getHrAct() {
        return hrAct;
   }

   public void setHrAct(BigDecimal hrAct) {
        this.hrAct = hrAct;
   }

   public BigDecimal getNotaPontual() {
        return notaPontual;
   }

   public void setNotaPontual(BigDecimal notaPontual) {
        this.notaPontual = notaPontual;
   }

   public BigDecimal getNotaQualidade() {
        return notaQualidade;
   }

   public void setNotaQualidade(BigDecimal notaQualidade) {
        this.notaQualidade = notaQualidade;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public String getOcorrencias() {
        return ocorrencias;
   }

   public void setOcorrencias(String ocorrencias) {
        this.ocorrencias = ocorrencias;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "AcompanhamentoNota";
   }

   @Override
   public AcompanhamentoNota fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhOcor = vo.asTimestamp("DHOCOR");
        this.digitado = vo.asString("DIGITADO");
        this.hrAct = vo.asBigDecimal("HRACT");
        this.notaPontual = vo.asBigDecimal("NOTAPONTUAL");
        this.notaQualidade = vo.asBigDecimal("NOTAQUALIDADE");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.ocorrencias = vo.asString("OCORRENCIAS");
        this.referencia = vo.asString("REFERENCIA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
