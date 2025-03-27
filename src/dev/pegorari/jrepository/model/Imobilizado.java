package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Imobilizado extends AbstractSankhyaEntity<Imobilizado> {
   public String getDescrLocal() {
        return this.getVo().asString("DESCRLOCAL");
   }

   public void setDescrLocal(String descrLocal) {
        markAsChanged("DESCRLOCAL", descrLocal);
   }

   public Timestamp getDtBaixa() {
        return this.getVo().asTimestamp("DTBAIXA");
   }

   public void setDtBaixa(Timestamp dtBaixa) {
        markAsChanged("DTBAIXA", dtBaixa);
   }

   public Timestamp getDtCompra() {
        return this.getVo().asTimestamp("DTCOMPRA");
   }

   public void setDtCompra(Timestamp dtCompra) {
        markAsChanged("DTCOMPRA", dtCompra);
   }

   public Timestamp getDtFimDep() {
        return this.getVo().asTimestamp("DTFIMDEP");
   }

   public void setDtFimDep(Timestamp dtFimDep) {
        markAsChanged("DTFIMDEP", dtFimDep);
   }

   public Timestamp getDtFimRefCiap() {
        return this.getVo().asTimestamp("DTFIMREFCIAP");
   }

   public void setDtFimRefCiap(Timestamp dtFimRefCiap) {
        markAsChanged("DTFIMREFCIAP", dtFimRefCiap);
   }

   public Timestamp getDtInicioDep() {
        return this.getVo().asTimestamp("DTINICIODEP");
   }

   public void setDtInicioDep(Timestamp dtInicioDep) {
        markAsChanged("DTINICIODEP", dtInicioDep);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuNotaBaixa() {
        return this.getVo().asBigDecimal("NUNOTABAIXA");
   }

   public void setNuNotaBaixa(BigDecimal nuNotaBaixa) {
        markAsChanged("NUNOTABAIXA", nuNotaBaixa);
   }

   public BigDecimal getValorPresente() {
        return this.getVo().asBigDecimal("VALORPRESENTE");
   }

   public void setValorPresente(BigDecimal valorPresente) {
        markAsChanged("VALORPRESENTE", valorPresente);
   }

   public BigDecimal getVlrDepOrig() {
        return this.getVo().asBigDecimal("VLRDEPORIG");
   }

   public void setVlrDepOrig(BigDecimal vlrDepOrig) {
        markAsChanged("VLRDEPORIG", vlrDepOrig);
   }

   public Timestamp getDtRetorno() {
        return this.getVo().asTimestamp("DTRETORNO");
   }

   public void setDtRetorno(Timestamp dtRetorno) {
        markAsChanged("DTRETORNO", dtRetorno);
   }

   public BigDecimal getNfDevVenda() {
        return this.getVo().asBigDecimal("NFDEVVENDA");
   }

   public void setNfDevVenda(BigDecimal nfDevVenda) {
        markAsChanged("NFDEVVENDA", nfDevVenda);
   }

   public BigDecimal getNfRetorno() {
        return this.getVo().asBigDecimal("NFRETORNO");
   }

   public void setNfRetorno(BigDecimal nfRetorno) {
        markAsChanged("NFRETORNO", nfRetorno);
   }

   public BigDecimal getNfSaida() {
        return this.getVo().asBigDecimal("NFSAIDA");
   }

   public void setNfSaida(BigDecimal nfSaida) {
        markAsChanged("NFSAIDA", nfSaida);
   }

   public String getNomePossuidor() {
        return this.getVo().asString("NOMEPOSSUIDOR");
   }

   public void setNomePossuidor(String nomePossuidor) {
        markAsChanged("NOMEPOSSUIDOR", nomePossuidor);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public BigDecimal getNumNotaBaixa() {
        return this.getVo().asBigDecimal("NUMNOTABAIXA");
   }

   public void setNumNotaBaixa(BigDecimal numNotaBaixa) {
        markAsChanged("NUMNOTABAIXA", numNotaBaixa);
   }

   public BigDecimal getNuNotaDev() {
        return this.getVo().asBigDecimal("NUNOTADEV");
   }

   public void setNuNotaDev(BigDecimal nuNotaDev) {
        markAsChanged("NUNOTADEV", nuNotaDev);
   }

   public BigDecimal getNuNotaDevVenda() {
        return this.getVo().asBigDecimal("NUNOTADEVVENDA");
   }

   public void setNuNotaDevVenda(BigDecimal nuNotaDevVenda) {
        markAsChanged("NUNOTADEVVENDA", nuNotaDevVenda);
   }

   public BigDecimal getNuNotaSaida() {
        return this.getVo().asBigDecimal("NUNOTASAIDA");
   }

   public void setNuNotaSaida(BigDecimal nuNotaSaida) {
        markAsChanged("NUNOTASAIDA", nuNotaSaida);
   }

   public BigDecimal getQtdMesesCiap() {
        return this.getVo().asBigDecimal("QTDMESESCIAP");
   }

   public void setQtdMesesCiap(BigDecimal qtdMesesCiap) {
        markAsChanged("QTDMESESCIAP", qtdMesesCiap);
   }

   public String getTemDepreciacao() {
        return this.getVo().asString("TEMDEPRECIACAO");
   }

   public void setTemDepreciacao(String temDepreciacao) {
        markAsChanged("TEMDEPRECIACAO", temDepreciacao);
   }

   public BigDecimal getVlrAquisicao() {
        return this.getVo().asBigDecimal("VLRAQUISICAO");
   }

   public void setVlrAquisicao(BigDecimal vlrAquisicao) {
        markAsChanged("VLRAQUISICAO", vlrAquisicao);
   }

   public BigDecimal getVlrDep() {
        return this.getVo().asBigDecimal("VLRDEP");
   }

   public void setVlrDep(BigDecimal vlrDep) {
        markAsChanged("VLRDEP", vlrDep);
   }

   public BigDecimal getVlrIcmsCiap() {
        return this.getVo().asBigDecimal("VLRICMSCIAP");
   }

   public void setVlrIcmsCiap(BigDecimal vlrIcmsCiap) {
        markAsChanged("VLRICMSCIAP", vlrIcmsCiap);
   }

   public BigDecimal getVlrIcmsDifCiap() {
        return this.getVo().asBigDecimal("VLRICMSDIFCIAP");
   }

   public void setVlrIcmsDifCiap(BigDecimal vlrIcmsDifCiap) {
        markAsChanged("VLRICMSDIFCIAP", vlrIcmsDifCiap);
   }

   public BigDecimal getVlrIcmsFrtCiap() {
        return this.getVo().asBigDecimal("VLRICMSFRTCIAP");
   }

   public void setVlrIcmsFrtCiap(BigDecimal vlrIcmsFrtCiap) {
        markAsChanged("VLRICMSFRTCIAP", vlrIcmsFrtCiap);
   }

   public BigDecimal getVlrIcmsStCiap() {
        return this.getVo().asBigDecimal("VLRICMSSTCIAP");
   }

   public void setVlrIcmsStCiap(BigDecimal vlrIcmsStCiap) {
        markAsChanged("VLRICMSSTCIAP", vlrIcmsStCiap);
   }

   public BigDecimal getVlrSaldo() {
        return this.getVo().asBigDecimal("VLRSALDO");
   }

   public void setVlrSaldo(BigDecimal vlrSaldo) {
        markAsChanged("VLRSALDO", vlrSaldo);
   }

   public String getCodBem() {
        return this.getVo().asString("CODBEM");
   }

   public void setCodBem(String codBem) {
        markAsChanged("CODBEM", codBem);
   }

   public String getCodBemAtual() {
        return this.getVo().asString("CODBEMATUAL");
   }

   public void setCodBemAtual(String codBemAtual) {
        markAsChanged("CODBEMATUAL", codBemAtual);
   }

   public String getCodBemOrig() {
        return this.getVo().asString("CODBEMORIG");
   }

   public void setCodBemOrig(String codBemOrig) {
        markAsChanged("CODBEMORIG", codBemOrig);
   }

   public BigDecimal getCodDep() {
        return this.getVo().asBigDecimal("CODDEP");
   }

   public void setCodDep(BigDecimal codDep) {
        markAsChanged("CODDEP", codDep);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtIniRefCiap() {
        return this.getVo().asTimestamp("DTINIREFCIAP");
   }

   public void setDtIniRefCiap(Timestamp dtIniRefCiap) {
        markAsChanged("DTINIREFCIAP", dtIniRefCiap);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodPossuidor() {
        return this.getVo().asBigDecimal("CODPOSSUIDOR");
   }

   public void setCodPossuidor(BigDecimal codPossuidor) {
        markAsChanged("CODPOSSUIDOR", codPossuidor);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDescrAbrev() {
        return this.getVo().asString("DESCRABREV");
   }

   public void setDescrAbrev(String descrAbrev) {
        markAsChanged("DESCRABREV", descrAbrev);
   }

   public String getDescrBem() {
        return this.getVo().asString("DESCRBEM");
   }

   public void setDescrBem(String descrBem) {
        markAsChanged("DESCRBEM", descrBem);
   }

   public BigDecimal getAliqCofins() {
        return this.getVo().asBigDecimal("ALIQCOFINS");
   }

   public void setAliqCofins(BigDecimal aliqCofins) {
        markAsChanged("ALIQCOFINS", aliqCofins);
   }

   public BigDecimal getAliqPis() {
        return this.getVo().asBigDecimal("ALIQPIS");
   }

   public void setAliqPis(BigDecimal aliqPis) {
        markAsChanged("ALIQPIS", aliqPis);
   }

   public BigDecimal getCstCofins() {
        return this.getVo().asBigDecimal("CSTCOFINS");
   }

   public void setCstCofins(BigDecimal cstCofins) {
        markAsChanged("CSTCOFINS", cstCofins);
   }

   public BigDecimal getCstPis() {
        return this.getVo().asBigDecimal("CSTPIS");
   }

   public void setCstPis(BigDecimal cstPis) {
        markAsChanged("CSTPIS", cstPis);
   }

   public String getDescrUtilBem() {
        return this.getVo().asString("DESCRUTILBEM");
   }

   public void setDescrUtilBem(String descrUtilBem) {
        markAsChanged("DESCRUTILBEM", descrUtilBem);
   }

   public Timestamp getDtFimAj() {
        return this.getVo().asTimestamp("DTFIMAJ");
   }

   public void setDtFimAj(Timestamp dtFimAj) {
        markAsChanged("DTFIMAJ", dtFimAj);
   }

   public Timestamp getDtInicioAj() {
        return this.getVo().asTimestamp("DTINICIOAJ");
   }

   public void setDtInicioAj(Timestamp dtInicioAj) {
        markAsChanged("DTINICIOAJ", dtInicioAj);
   }

   public BigDecimal getNParcPisCof() {
        return this.getVo().asBigDecimal("NPARCPISCOF");
   }

   public void setNParcPisCof(BigDecimal nParcPisCof) {
        markAsChanged("NPARCPISCOF", nParcPisCof);
   }

   public String getPisCofMp540() {
        return this.getVo().asString("PISCOFMP540");
   }

   public void setPisCofMp540(String pisCofMp540) {
        markAsChanged("PISCOFMP540", pisCofMp540);
   }

   public BigDecimal getSaldo() {
        return this.getVo().asBigDecimal("SALDO");
   }

   public void setSaldo(BigDecimal saldo) {
        markAsChanged("SALDO", saldo);
   }

   public String getTemAj() {
        return this.getVo().asString("TEMAJ");
   }

   public void setTemAj(String temAj) {
        markAsChanged("TEMAJ", temAj);
   }

   public String getTemCredPisCofinsDepr() {
        return this.getVo().asString("TEMCREDPISCOFINSDEPR");
   }

   public void setTemCredPisCofinsDepr(String temCredPisCofinsDepr) {
        markAsChanged("TEMCREDPISCOFINSDEPR", temCredPisCofinsDepr);
   }

   public String getTipoEntCiap() {
        return this.getVo().asString("TIPOENTCIAP");
   }

   public void setTipoEntCiap(String tipoEntCiap) {
        markAsChanged("TIPOENTCIAP", tipoEntCiap);
   }

   public BigDecimal getUtilImob() {
        return this.getVo().asBigDecimal("UTILIMOB");
   }

   public void setUtilImob(BigDecimal utilImob) {
        markAsChanged("UTILIMOB", utilImob);
   }

   public BigDecimal getVlrCompraAquisicao() {
        return this.getVo().asBigDecimal("VLRCOMPRAAQUISICAO");
   }

   public void setVlrCompraAquisicao(BigDecimal vlrCompraAquisicao) {
        markAsChanged("VLRCOMPRAAQUISICAO", vlrCompraAquisicao);
   }

   public BigDecimal getVlrDepAj() {
        return this.getVo().asBigDecimal("VLRDEPAJ");
   }

   public void setVlrDepAj(BigDecimal vlrDepAj) {
        markAsChanged("VLRDEPAJ", vlrDepAj);
   }

   public BigDecimal getVlrSaldoAj() {
        return this.getVo().asBigDecimal("VLRSALDOAJ");
   }

   public void setVlrSaldoAj(BigDecimal vlrSaldoAj) {
        markAsChanged("VLRSALDOAJ", vlrSaldoAj);
   }

   public BigDecimal getVlrTotDespesaBem() {
        return this.getVo().asBigDecimal("VLRTOTDESPESABEM");
   }

   public void setVlrTotDespesaBem(BigDecimal vlrTotDespesaBem) {
        markAsChanged("VLRTOTDESPESABEM", vlrTotDespesaBem);
   }

   public BigDecimal getVidaUtil() {
        return this.getVo().asBigDecimal("VIDAUTIL");
   }

   public void setVidaUtil(BigDecimal vidaUtil) {
        markAsChanged("VIDAUTIL", vidaUtil);
   }

   public BigDecimal getCodProdOrig() {
        return this.getVo().asBigDecimal("CODPRODORIG");
   }

   public void setCodProdOrig(BigDecimal codProdOrig) {
        markAsChanged("CODPRODORIG", codProdOrig);
   }

   public BigDecimal getCodUsuDesmembramento() {
        return this.getVo().asBigDecimal("CODUSUDESMEMBRAMENTO");
   }

   public void setCodUsuDesmembramento(BigDecimal codUsuDesmembramento) {
        markAsChanged("CODUSUDESMEMBRAMENTO", codUsuDesmembramento);
   }

   public Timestamp getDhDesmembramento() {
        return this.getVo().asTimestamp("DHDESMEMBRAMENTO");
   }

   public void setDhDesmembramento(Timestamp dhDesmembramento) {
        markAsChanged("DHDESMEMBRAMENTO", dhDesmembramento);
   }

   public BigDecimal getNuNotaOrigDesmemb() {
        return this.getVo().asBigDecimal("NUNOTAORIGDESMEMB");
   }

   public void setNuNotaOrigDesmemb(BigDecimal nuNotaOrigDesmemb) {
        markAsChanged("NUNOTAORIGDESMEMB", nuNotaOrigDesmemb);
   }

   public BigDecimal getVlrExcBaseCred() {
        return this.getVo().asBigDecimal("VLREXCBASECRED");
   }

   public void setVlrExcBaseCred(BigDecimal vlrExcBaseCred) {
        markAsChanged("VLREXCBASECRED", vlrExcBaseCred);
   }

   public BigDecimal getCodUsuCompra() {
        return this.getVo().asBigDecimal("CODUSUCOMPRA");
   }

   public void setCodUsuCompra(BigDecimal codUsuCompra) {
        markAsChanged("CODUSUCOMPRA", codUsuCompra);
   }

   public Timestamp getDhAlterCompra() {
        return this.getVo().asTimestamp("DHALTERCOMPRA");
   }

   public void setDhAlterCompra(Timestamp dhAlterCompra) {
        markAsChanged("DHALTERCOMPRA", dhAlterCompra);
   }

   public String getDigitadoCompra() {
        return this.getVo().asString("DIGITADOCOMPRA");
   }

   public void setDigitadoCompra(String digitadoCompra) {
        markAsChanged("DIGITADOCOMPRA", digitadoCompra);
   }

   public BigDecimal getVlrCofinsCompra() {
        return this.getVo().asBigDecimal("VLRCOFINSCOMPRA");
   }

   public void setVlrCofinsCompra(BigDecimal vlrCofinsCompra) {
        markAsChanged("VLRCOFINSCOMPRA", vlrCofinsCompra);
   }

   public BigDecimal getVlrCompraAquisicaoCalc() {
        return this.getVo().asBigDecimal("VLRCOMPRAAQUISICAOCALC");
   }

   public void setVlrCompraAquisicaoCalc(BigDecimal vlrCompraAquisicaoCalc) {
        markAsChanged("VLRCOMPRAAQUISICAOCALC", vlrCompraAquisicaoCalc);
   }

   public BigDecimal getVlrIcmsCiapCalc() {
        return this.getVo().asBigDecimal("VLRICMSCIAPCALC");
   }

   public void setVlrIcmsCiapCalc(BigDecimal vlrIcmsCiapCalc) {
        markAsChanged("VLRICMSCIAPCALC", vlrIcmsCiapCalc);
   }

   public BigDecimal getVlrIcmsStCiapCalc() {
        return this.getVo().asBigDecimal("VLRICMSSTCIAPCALC");
   }

   public void setVlrIcmsStCiapCalc(BigDecimal vlrIcmsStCiapCalc) {
        markAsChanged("VLRICMSSTCIAPCALC", vlrIcmsStCiapCalc);
   }

   public BigDecimal getVlrPisCompra() {
        return this.getVo().asBigDecimal("VLRPISCOMPRA");
   }

   public void setVlrPisCompra(BigDecimal vlrPisCompra) {
        markAsChanged("VLRPISCOMPRA", vlrPisCompra);
   }

   @Override
   public String getTableName() {
        return "TCIBEM";
   }

   @Override
   public String getEntityName() {
        return "Imobilizado";
   }

   @Override
   public Imobilizado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
