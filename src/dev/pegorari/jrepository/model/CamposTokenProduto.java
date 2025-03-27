package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CamposTokenProduto extends AbstractSankhyaEntity<CamposTokenProduto> {
   public String getCampo() {
        return this.getVo().asString("CAMPO");
   }

   public void setCampo(String campo) {
        markAsChanged("CAMPO", campo);
   }

   public BigDecimal getCodCfg() {
        return this.getVo().asBigDecimal("CODCFG");
   }

   public void setCodCfg(BigDecimal codCfg) {
        markAsChanged("CODCFG", codCfg);
   }

   public String getEntidade() {
        return this.getVo().asString("ENTIDADE");
   }

   public void setEntidade(String entidade) {
        markAsChanged("ENTIDADE", entidade);
   }

   public BigDecimal getRelevancia() {
        return this.getVo().asBigDecimal("RELEVANCIA");
   }

   public void setRelevancia(BigDecimal relevancia) {
        markAsChanged("RELEVANCIA", relevancia);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   @Override
   public String getTableName() {
        return "TGFTOKCAM";
   }

   @Override
   public String getEntityName() {
        return "CamposTokenProduto";
   }

   @Override
   public CamposTokenProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
