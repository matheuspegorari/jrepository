package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class BaseVencimento extends AbstractSankhyaEntity<BaseVencimento> {
   public String getApresTransp() {
        return this.getVo().asString("APRESTRANSP");
   }

   public void setApresTransp(String apresTransp) {
        markAsChanged("APRESTRANSP", apresTransp);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getBaixa() {
        return this.getVo().asString("BAIXA");
   }

   public void setBaixa(String baixa) {
        markAsChanged("BAIXA", baixa);
   }

   public BigDecimal getBasePrazo() {
        return this.getVo().asBigDecimal("BASEPRAZO");
   }

   public void setBasePrazo(BigDecimal basePrazo) {
        markAsChanged("BASEPRAZO", basePrazo);
   }

   public BigDecimal getCodCtaCtb1() {
        return this.getVo().asBigDecimal("CODCTACTB_1");
   }

   public void setCodCtaCtb1(BigDecimal codCtaCtb1) {
        markAsChanged("CODCTACTB_1", codCtaCtb1);
   }

   public BigDecimal getCodCtaCtb2() {
        return this.getVo().asBigDecimal("CODCTACTB_2");
   }

   public void setCodCtaCtb2(BigDecimal codCtaCtb2) {
        markAsChanged("CODCTACTB_2", codCtaCtb2);
   }

   public BigDecimal getCodFormDescMax() {
        return this.getVo().asBigDecimal("CODFORMDESCMAX");
   }

   public void setCodFormDescMax(BigDecimal codFormDescMax) {
        markAsChanged("CODFORMDESCMAX", codFormDescMax);
   }

   public BigDecimal getCodFormDescMaxItens() {
        return this.getVo().asBigDecimal("CODFORMDESCMAXITENS");
   }

   public void setCodFormDescMaxItens(BigDecimal codFormDescMaxItens) {
        markAsChanged("CODFORMDESCMAXITENS", codFormDescMaxItens);
   }

   public BigDecimal getCodObsPadrao() {
        return this.getVo().asBigDecimal("CODOBSPADRAO");
   }

   public void setCodObsPadrao(BigDecimal codObsPadrao) {
        markAsChanged("CODOBSPADRAO", codObsPadrao);
   }

   public BigDecimal getCodTab() {
        return this.getVo().asBigDecimal("CODTAB");
   }

   public void setCodTab(BigDecimal codTab) {
        markAsChanged("CODTAB", codTab);
   }

   public BigDecimal getCodTcf() {
        return this.getVo().asBigDecimal("CODTCF");
   }

   public void setCodTcf(BigDecimal codTcf) {
        markAsChanged("CODTCF", codTcf);
   }

   public BigDecimal getCodTipVenda() {
        return this.getVo().asBigDecimal("CODTIPVENDA");
   }

   public void setCodTipVenda(BigDecimal codTipVenda) {
        markAsChanged("CODTIPVENDA", codTipVenda);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getComissao() {
        return this.getVo().asBigDecimal("COMISSAO");
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
   }

   public BigDecimal getCompraMax() {
        return this.getVo().asBigDecimal("COMPRAMAX");
   }

   public void setCompraMax(BigDecimal compraMax) {
        markAsChanged("COMPRAMAX", compraMax);
   }

   public BigDecimal getDescMax() {
        return this.getVo().asBigDecimal("DESCMAX");
   }

   public void setDescMax(BigDecimal descMax) {
        markAsChanged("DESCMAX", descMax);
   }

   public String getDescProm() {
        return this.getVo().asString("DESCPROM");
   }

   public void setDescProm(String descProm) {
        markAsChanged("DESCPROM", descProm);
   }

   public String getDescTipVenda() {
        return this.getVo().asString("DESCRTIPVENDA");
   }

   public void setDescTipVenda(String descTipVenda) {
        markAsChanged("DESCRTIPVENDA", descTipVenda);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getEditaSimulacao() {
        return this.getVo().asString("EDITASIMULACAO");
   }

   public void setEditaSimulacao(String editaSimulacao) {
        markAsChanged("EDITASIMULACAO", editaSimulacao);
   }

   public String getEmiteBoleta() {
        return this.getVo().asString("EMITEBOLETA");
   }

   public void setEmiteBoleta(String emiteBoleta) {
        markAsChanged("EMITEBOLETA", emiteBoleta);
   }

   public String getEmiteDupl() {
        return this.getVo().asString("EMITEDUPL");
   }

   public void setEmiteDupl(String emiteDupl) {
        markAsChanged("EMITEDUPL", emiteDupl);
   }

   public String getFixaVenc() {
        return this.getVo().asString("FIXAVENC");
   }

   public void setFixaVenc(String fixaVenc) {
        markAsChanged("FIXAVENC", fixaVenc);
   }

   public String getFlex() {
        return this.getVo().asString("FLEX");
   }

   public void setFlex(String flex) {
        markAsChanged("FLEX", flex);
   }

   public String getGrupoAutor() {
        return this.getVo().asString("GRUPOAUTOR");
   }

   public void setGrupoAutor(String grupoAutor) {
        markAsChanged("GRUPOAUTOR", grupoAutor);
   }

   public BigDecimal getLucroMin() {
        return this.getVo().asBigDecimal("LUCROMIN");
   }

   public void setLucroMin(BigDecimal lucroMin) {
        markAsChanged("LUCROMIN", lucroMin);
   }

   public BigDecimal getMargemMin() {
        return this.getVo().asBigDecimal("MARGEMMIN");
   }

   public void setMargemMin(BigDecimal margemMin) {
        markAsChanged("MARGEMMIN", margemMin);
   }

   public String getModeloPgto() {
        return this.getVo().asString("MODELOPGTO");
   }

   public void setModeloPgto(String modeloPgto) {
        markAsChanged("MODELOPGTO", modeloPgto);
   }

   public BigDecimal getNroParcelas() {
        return this.getVo().asBigDecimal("NROPARCELAS");
   }

   public void setNroParcelas(BigDecimal nroParcelas) {
        markAsChanged("NROPARCELAS", nroParcelas);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getPercMinEntrada() {
        return this.getVo().asBigDecimal("PERCMINENTRADA");
   }

   public void setPercMinEntrada(BigDecimal percMinEntrada) {
        markAsChanged("PERCMINENTRADA", percMinEntrada);
   }

   public String getPodeConsumidor() {
        return this.getVo().asString("PODECONSUMIDOR");
   }

   public void setPodeConsumidor(String podeConsumidor) {
        markAsChanged("PODECONSUMIDOR", podeConsumidor);
   }

   public String getPossuiSimSalva() {
        return this.getVo().asString("POSSUISIMSALVA");
   }

   public void setPossuiSimSalva(String possuiSimSalva) {
        markAsChanged("POSSUISIMSALVA", possuiSimSalva);
   }

   public BigDecimal getPrazoMax() {
        return this.getVo().asBigDecimal("PRAZOMAX");
   }

   public void setPrazoMax(BigDecimal prazoMax) {
        markAsChanged("PRAZOMAX", prazoMax);
   }

   public BigDecimal getPrazoMaxPriParc() {
        return this.getVo().asBigDecimal("PRAZOMAXPRIPARC");
   }

   public void setPrazoMaxPriParc(BigDecimal prazoMaxPriParc) {
        markAsChanged("PRAZOMAXPRIPARC", prazoMaxPriParc);
   }

   public BigDecimal getPrazoMedMax() {
        return this.getVo().asBigDecimal("PRAZOMEDMAX");
   }

   public void setPrazoMedMax(BigDecimal prazoMedMax) {
        markAsChanged("PRAZOMEDMAX", prazoMedMax);
   }

   public BigDecimal getPrazoMin() {
        return this.getVo().asBigDecimal("PRAZOMIN");
   }

   public void setPrazoMin(BigDecimal prazoMin) {
        markAsChanged("PRAZOMIN", prazoMin);
   }

   public String getSomaPrazoCliente() {
        return this.getVo().asString("SOMAPRAZOCLIENTE");
   }

   public void setSomaPrazoCliente(String somaPrazoCliente) {
        markAsChanged("SOMAPRAZOCLIENTE", somaPrazoCliente);
   }

   public String getSubTipoVenda() {
        return this.getVo().asString("SUBTIPOVENDA");
   }

   public void setSubTipoVenda(String subTipoVenda) {
        markAsChanged("SUBTIPOVENDA", subTipoVenda);
   }

   public BigDecimal getTaxaJuro() {
        return this.getVo().asBigDecimal("TAXAJURO");
   }

   public void setTaxaJuro(BigDecimal taxaJuro) {
        markAsChanged("TAXAJURO", taxaJuro);
   }

   public BigDecimal getTaxaJurSim() {
        return this.getVo().asBigDecimal("TAXAJURSIM");
   }

   public void setTaxaJurSim(BigDecimal taxaJurSim) {
        markAsChanged("TAXAJURSIM", taxaJurSim);
   }

   public String getTipJuro() {
        return this.getVo().asString("TIPJURO");
   }

   public void setTipJuro(String tipJuro) {
        markAsChanged("TIPJURO", tipJuro);
   }

   public String getTipoJurSim() {
        return this.getVo().asString("TIPOJURSIM");
   }

   public void setTipoJurSim(String tipoJurSim) {
        markAsChanged("TIPOJURSIM", tipoJurSim);
   }

   public String getTipTaxa() {
        return this.getVo().asString("TIPTAXA");
   }

   public void setTipTaxa(String tipTaxa) {
        markAsChanged("TIPTAXA", tipTaxa);
   }

   public BigDecimal getTxParcAdm() {
        return this.getVo().asBigDecimal("TXPARCADM");
   }

   public void setTxParcAdm(BigDecimal txParcAdm) {
        markAsChanged("TXPARCADM", txParcAdm);
   }

   public String getValPrazoCliente() {
        return this.getVo().asString("VALPRAZOCLIENTE");
   }

   public void setValPrazoCliente(String valPrazoCliente) {
        markAsChanged("VALPRAZOCLIENTE", valPrazoCliente);
   }

   public BigDecimal getVendaMax() {
        return this.getVo().asBigDecimal("VENDAMAX");
   }

   public void setVendaMax(BigDecimal vendaMax) {
        markAsChanged("VENDAMAX", vendaMax);
   }

   public BigDecimal getVendaMin() {
        return this.getVo().asBigDecimal("VENDAMIN");
   }

   public void setVendaMin(BigDecimal vendaMin) {
        markAsChanged("VENDAMIN", vendaMin);
   }

   public String getArredPrimeiraParc() {
        return this.getVo().asString("ARREDPRIMEIRAPARC");
   }

   public void setArredPrimeiraParc(String arredPrimeiraParc) {
        markAsChanged("ARREDPRIMEIRAPARC", arredPrimeiraParc);
   }

   public BigDecimal getTimQtdParc() {
        return this.getVo().asBigDecimal("TIMQTDPARC");
   }

   public void setTimQtdParc(BigDecimal timQtdParc) {
        markAsChanged("TIMQTDPARC", timQtdParc);
   }

   public String getTruncParcela() {
        return this.getVo().asString("TRUNCPARCELA");
   }

   public void setTruncParcela(String truncParcela) {
        markAsChanged("TRUNCPARCELA", truncParcela);
   }

   public String getFastUsa() {
        return this.getVo().asString("FASTUSA");
   }

   public void setFastUsa(String fastUsa) {
        markAsChanged("FASTUSA", fastUsa);
   }

   public String getVencPrefixPed() {
        return this.getVo().asString("VENCPREFIXPED");
   }

   public void setVencPrefixPed(String vencPrefixPed) {
        markAsChanged("VENCPREFIXPED", vencPrefixPed);
   }

   public String getIntegraEconect() {
        return this.getVo().asString("INTEGRAECONECT");
   }

   public void setIntegraEconect(String integraEconect) {
        markAsChanged("INTEGRAECONECT", integraEconect);
   }

   public BigDecimal getFormaRecBtoSocin() {
        return this.getVo().asBigDecimal("FORMARECBTOSOCIN");
   }

   public void setFormaRecBtoSocin(BigDecimal formaRecBtoSocin) {
        markAsChanged("FORMARECBTOSOCIN", formaRecBtoSocin);
   }

   public String getExVendaMais() {
        return this.getVo().asString("EXVENDAMAIS");
   }

   public void setExVendaMais(String exVendaMais) {
        markAsChanged("EXVENDAMAIS", exVendaMais);
   }

   @Override
   public String getTableName() {
        return "TGFTPV";
   }

   @Override
   public String getEntityName() {
        return "BaseVencimento";
   }

   @Override
   public BaseVencimento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
