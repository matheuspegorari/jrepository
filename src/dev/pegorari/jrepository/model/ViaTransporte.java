package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ViaTransporte implements SankhyaEntity<ViaTransporte> {

   private BigDecimal codModPed;
   private BigDecimal codVtp;
   private String descricao;
   private BigDecimal leadTime;
   private BigDecimal leadTimeConf;
   private BigDecimal leadTimeDesp;
   private BigDecimal leadTimeEmpc;
   private BigDecimal leadTimeProc;
   private BigDecimal qtdItens;
   private String tipo;

   public BigDecimal getCodModPed() {
        return codModPed;
   }

   public void setCodModPed(BigDecimal codModPed) {
        this.codModPed = codModPed;
   }

   public BigDecimal getCodVtp() {
        return codVtp;
   }

   public void setCodVtp(BigDecimal codVtp) {
        this.codVtp = codVtp;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getLeadTime() {
        return leadTime;
   }

   public void setLeadTime(BigDecimal leadTime) {
        this.leadTime = leadTime;
   }

   public BigDecimal getLeadTimeConf() {
        return leadTimeConf;
   }

   public void setLeadTimeConf(BigDecimal leadTimeConf) {
        this.leadTimeConf = leadTimeConf;
   }

   public BigDecimal getLeadTimeDesp() {
        return leadTimeDesp;
   }

   public void setLeadTimeDesp(BigDecimal leadTimeDesp) {
        this.leadTimeDesp = leadTimeDesp;
   }

   public BigDecimal getLeadTimeEmpc() {
        return leadTimeEmpc;
   }

   public void setLeadTimeEmpc(BigDecimal leadTimeEmpc) {
        this.leadTimeEmpc = leadTimeEmpc;
   }

   public BigDecimal getLeadTimeProc() {
        return leadTimeProc;
   }

   public void setLeadTimeProc(BigDecimal leadTimeProc) {
        this.leadTimeProc = leadTimeProc;
   }

   public BigDecimal getQtdItens() {
        return qtdItens;
   }

   public void setQtdItens(BigDecimal qtdItens) {
        this.qtdItens = qtdItens;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "ViaTransporte";
   }

   @Override
   public ViaTransporte fromVO(DynamicVO vo) {
        this.codModPed = vo.asBigDecimal("CODMODPED");
        this.codVtp = vo.asBigDecimal("CODVTP");
        this.descricao = vo.asString("DESCRICAO");
        this.leadTime = vo.asBigDecimal("LEADTIME");
        this.leadTimeConf = vo.asBigDecimal("LEADTIMECONF");
        this.leadTimeDesp = vo.asBigDecimal("LEADTIMEDESP");
        this.leadTimeEmpc = vo.asBigDecimal("LEADTIMEEMPC");
        this.leadTimeProc = vo.asBigDecimal("LEADTIMEPROC");
        this.qtdItens = vo.asBigDecimal("QTDITENS");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
