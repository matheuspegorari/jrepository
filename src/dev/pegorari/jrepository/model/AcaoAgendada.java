package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AcaoAgendada extends AbstractSankhyaEntity<AcaoAgendada> {
   public BigDecimal getNuAag() {
        return this.getVo().asBigDecimal("NUAAG");
   }

   public void setNuAag(BigDecimal nuAag) {
        markAsChanged("NUAAG", nuAag);
   }

   public String getAutoTran() {
        return this.getVo().asString("AUTOTRAN");
   }

   public void setAutoTran(String autoTran) {
        markAsChanged("AUTOTRAN", autoTran);
   }

   public BigDecimal getCodModulo() {
        return this.getVo().asBigDecimal("CODMODULO");
   }

   public void setCodModulo(BigDecimal codModulo) {
        markAsChanged("CODMODULO", codModulo);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getAcao() {
        return this.getVo().asString("ACAO");
   }

   public void setAcao(String acao) {
        markAsChanged("ACAO", acao);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getFonteDados() {
        return this.getVo().asString("FONTEDADOS");
   }

   public void setFonteDados(String fonteDados) {
        markAsChanged("FONTEDADOS", fonteDados);
   }

   public String getTipoGatilho() {
        return this.getVo().asString("TIPOGATILHO");
   }

   public void setTipoGatilho(String tipoGatilho) {
        markAsChanged("TIPOGATILHO", tipoGatilho);
   }

   public String getTipoAcao() {
        return this.getVo().asString("TIPOACAO");
   }

   public void setTipoAcao(String tipoAcao) {
        markAsChanged("TIPOACAO", tipoAcao);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getCodUsuLogin() {
        return this.getVo().asBigDecimal("CODUSULOGIN");
   }

   public void setCodUsuLogin(BigDecimal codUsuLogin) {
        markAsChanged("CODUSULOGIN", codUsuLogin);
   }

   public String getExpGatilho() {
        return this.getVo().asString("EXPGATILHO");
   }

   public void setExpGatilho(String expGatilho) {
        markAsChanged("EXPGATILHO", expGatilho);
   }

   @Override
   public String getTableName() {
        return "TSIAAG";
   }

   @Override
   public String getEntityName() {
        return "AcaoAgendada";
   }

   @Override
   public AcaoAgendada fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
