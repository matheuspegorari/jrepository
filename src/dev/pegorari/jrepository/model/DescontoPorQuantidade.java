package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DescontoPorQuantidade extends AbstractSankhyaEntity<DescontoPorQuantidade> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuPromocao() {
        return this.getVo().asBigDecimal("NUPROMOCAO");
   }

   public void setNuPromocao(BigDecimal nuPromocao) {
        markAsChanged("NUPROMOCAO", nuPromocao);
   }

   public BigDecimal getPercDesc() {
        return this.getVo().asBigDecimal("PERCDESC");
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
   }

   public BigDecimal getQtde() {
        return this.getVo().asBigDecimal("QTDE");
   }

   public void setQtde(BigDecimal qtde) {
        markAsChanged("QTDE", qtde);
   }

   public String getTipDesc() {
        return this.getVo().asString("TIPDESC");
   }

   public void setTipDesc(String tipDesc) {
        markAsChanged("TIPDESC", tipDesc);
   }

   public String getAtNuVersao() {
        return this.getVo().asString("ATUNUVERSAO");
   }

   public void setAtNuVersao(String atNuVersao) {
        markAsChanged("ATUNUVERSAO", atNuVersao);
   }

   public BigDecimal getNuVersao() {
        return this.getVo().asBigDecimal("NUVERSAO");
   }

   public void setNuVersao(BigDecimal nuVersao) {
        markAsChanged("NUVERSAO", nuVersao);
   }

   @Override
   public String getTableName() {
        return "TGFDPQ";
   }

   @Override
   public String getEntityName() {
        return "DescontoPorQuantidade";
   }

   @Override
   public DescontoPorQuantidade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
