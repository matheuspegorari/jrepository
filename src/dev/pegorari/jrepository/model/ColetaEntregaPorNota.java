package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ColetaEntregaPorNota implements SankhyaEntity<ColetaEntregaPorNota> {

   private String cgcCpf;
   private BigDecimal codMunFis;
   private BigDecimal codParc;
   private String inscEstad;
   private BigDecimal nuNota;
   private BigDecimal sequencia;
   private String tipo;
   private BigDecimal tipoTransp;

   public String getCgcCpf() {
        return cgcCpf;
   }

   public void setCgcCpf(String cgcCpf) {
        this.cgcCpf = cgcCpf;
   }

   public BigDecimal getCodMunFis() {
        return codMunFis;
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        this.codMunFis = codMunFis;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public String getInscEstad() {
        return inscEstad;
   }

   public void setInscEstad(String inscEstad) {
        this.inscEstad = inscEstad;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   public BigDecimal getTipoTransp() {
        return tipoTransp;
   }

   public void setTipoTransp(BigDecimal tipoTransp) {
        this.tipoTransp = tipoTransp;
   }

   @Override
   public String getEntityName() {
        return "ColetaEntregaPorNota";
   }

   @Override
   public ColetaEntregaPorNota fromVO(DynamicVO vo) {
        this.cgcCpf = vo.asString("CGCCPF");
        this.codMunFis = vo.asBigDecimal("CODMUNFIS");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.inscEstad = vo.asString("INSCESTAD");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipo = vo.asString("TIPO");
        this.tipoTransp = vo.asBigDecimal("TIPOTRANSP");
        return this;
   }
}
