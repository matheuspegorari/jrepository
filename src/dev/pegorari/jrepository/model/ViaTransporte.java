package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ViaTransporte extends AbstractSankhyaEntity<ViaTransporte> {
   public BigDecimal getCodModPed() {
        return this.getVo().asBigDecimal("CODMODPED");
   }

   public void setCodModPed(BigDecimal codModPed) {
        markAsChanged("CODMODPED", codModPed);
   }

   public BigDecimal getCodVtp() {
        return this.getVo().asBigDecimal("CODVTP");
   }

   public void setCodVtp(BigDecimal codVtp) {
        markAsChanged("CODVTP", codVtp);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getLeadTime() {
        return this.getVo().asBigDecimal("LEADTIME");
   }

   public void setLeadTime(BigDecimal leadTime) {
        markAsChanged("LEADTIME", leadTime);
   }

   public BigDecimal getLeadTimeConf() {
        return this.getVo().asBigDecimal("LEADTIMECONF");
   }

   public void setLeadTimeConf(BigDecimal leadTimeConf) {
        markAsChanged("LEADTIMECONF", leadTimeConf);
   }

   public BigDecimal getLeadTimeDesp() {
        return this.getVo().asBigDecimal("LEADTIMEDESP");
   }

   public void setLeadTimeDesp(BigDecimal leadTimeDesp) {
        markAsChanged("LEADTIMEDESP", leadTimeDesp);
   }

   public BigDecimal getLeadTimeEmpc() {
        return this.getVo().asBigDecimal("LEADTIMEEMPC");
   }

   public void setLeadTimeEmpc(BigDecimal leadTimeEmpc) {
        markAsChanged("LEADTIMEEMPC", leadTimeEmpc);
   }

   public BigDecimal getLeadTimeProc() {
        return this.getVo().asBigDecimal("LEADTIMEPROC");
   }

   public void setLeadTimeProc(BigDecimal leadTimeProc) {
        markAsChanged("LEADTIMEPROC", leadTimeProc);
   }

   public BigDecimal getQtdItens() {
        return this.getVo().asBigDecimal("QTDITENS");
   }

   public void setQtdItens(BigDecimal qtdItens) {
        markAsChanged("QTDITENS", qtdItens);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TGFVTP";
   }

   @Override
   public String getEntityName() {
        return "ViaTransporte";
   }

   @Override
   public ViaTransporte fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
