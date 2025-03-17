package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class CaixaFlowrack implements SankhyaEntity<CaixaFlowrack> {

   private BigDecimal codVolume;
   private String conferido;
   private BigDecimal nuSeparacao;
   private BigDecimal nuTarefa;
   private BigDecimal qtde;
   private BigDecimal seqTarefa;
   private BigDecimal sequencia;
   private String tipoVolume;

   public BigDecimal getCodVolume() {
        return codVolume;
   }

   public void setCodVolume(BigDecimal codVolume) {
        this.codVolume = codVolume;
   }

   public String getConferido() {
        return conferido;
   }

   public void setConferido(String conferido) {
        this.conferido = conferido;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getQtde() {
        return qtde;
   }

   public void setQtde(BigDecimal qtde) {
        this.qtde = qtde;
   }

   public BigDecimal getSeqTarefa() {
        return seqTarefa;
   }

   public void setSeqTarefa(BigDecimal seqTarefa) {
        this.seqTarefa = seqTarefa;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipoVolume() {
        return tipoVolume;
   }

   public void setTipoVolume(String tipoVolume) {
        this.tipoVolume = tipoVolume;
   }

   @Override
   public String getEntityName() {
        return "CaixaFlowrack";
   }

   @Override
   public CaixaFlowrack fromVO(DynamicVO vo) {
        this.codVolume = vo.asBigDecimal("CODVOLUME");
        this.conferido = vo.asString("CONFERIDO");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.qtde = vo.asBigDecimal("QTDE");
        this.seqTarefa = vo.asBigDecimal("SEQTAREFA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipoVolume = vo.asString("TIPOVOLUME");
        return this;
   }
}
