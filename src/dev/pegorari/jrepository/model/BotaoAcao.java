package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class BotaoAcao extends AbstractSankhyaEntity<BotaoAcao> {
   public BigDecimal getCodModulo() {
        return this.getVo().asBigDecimal("CODMODULO");
   }

   public void setCodModulo(BigDecimal codModulo) {
        markAsChanged("CODMODULO", codModulo);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public String getControlaAcesso() {
        return this.getVo().asString("CONTROLAACESSO");
   }

   public void setControlaAcesso(String controlaAcesso) {
        markAsChanged("CONTROLAACESSO", controlaAcesso);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getIdBtnAcao() {
        return this.getVo().asBigDecimal("IDBTNACAO");
   }

   public void setIdBtnAcao(BigDecimal idBtnAcao) {
        markAsChanged("IDBTNACAO", idBtnAcao);
   }

   public String getNomeInstancia() {
        return this.getVo().asString("NOMEINSTANCIA");
   }

   public void setNomeInstancia(String nomeInstancia) {
        markAsChanged("NOMEINSTANCIA", nomeInstancia);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getResourceId() {
        return this.getVo().asString("RESOURCEID");
   }

   public void setResourceId(String resourceId) {
        markAsChanged("RESOURCEID", resourceId);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTeclaAtalho() {
        return this.getVo().asString("TECLAATALHO");
   }

   public void setTeclaAtalho(String teclaAtalho) {
        markAsChanged("TECLAATALHO", teclaAtalho);
   }

   @Override
   public String getTableName() {
        return "TSIBTA";
   }

   @Override
   public String getEntityName() {
        return "BotaoAcao";
   }

   @Override
   public BotaoAcao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
