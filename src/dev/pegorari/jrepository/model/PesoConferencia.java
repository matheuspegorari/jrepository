package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PesoConferencia extends AbstractSankhyaEntity<PesoConferencia> {
   private BigDecimal codPcon;
   private BigDecimal nuConf;
   private BigDecimal pesoBruto;
   private BigDecimal pesoLiquido;
   private BigDecimal seqConf;

   public BigDecimal getCodPcon() {
        return codPcon;
   }

   public void setCodPcon(BigDecimal codPcon) {
        markAsChanged("CODPCON", codPcon);
        this.codPcon = codPcon;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
        this.pesoBruto = pesoBruto;
   }

   public BigDecimal getPesoLiquido() {
        return pesoLiquido;
   }

   public void setPesoLiquido(BigDecimal pesoLiquido) {
        markAsChanged("PESOLIQUIDO", pesoLiquido);
        this.pesoLiquido = pesoLiquido;
   }

   public BigDecimal getSeqConf() {
        return seqConf;
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
        this.seqConf = seqConf;
   }

   @Override
   public String getTableName() {
        return "TGFPCON";
   }

   @Override
   public String getEntityName() {
        return "PesoConferencia";
   }

   @Override
   public PesoConferencia fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codPcon = vo.asBigDecimal("CODPCON");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.pesoLiquido = vo.asBigDecimal("PESOLIQUIDO");
        this.seqConf = vo.asBigDecimal("SEQCONF");
        return this;
   }
}
